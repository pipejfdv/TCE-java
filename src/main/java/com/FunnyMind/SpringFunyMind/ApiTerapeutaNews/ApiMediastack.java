package com.FunnyMind.SpringFunyMind.ApiTerapeutaNews;

import com.FunnyMind.SpringFunyMind.Entitys.ApiResponseNews;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
@Component
public class ApiMediastack {
    // ------------- API TETAPUTA NEWS -----------------
    public List<ApiResponseNews> apiMediastackNoticias (){
        //Datos para la consulta
        String APIKEY= "8490e69717d0b171cb3ae177c0217007";
        String baseUrl = "https://api.mediastack.com/v1/news";

        //creación de consulta
        String url = baseUrl + "?access_key=" + APIKEY + "&categories=health&limit=10" ;
        try {
            //se crea el elemento completo
            URL apiNews = new URL(url);
            //crear conexion con una url con http y abrir conexion
            HttpURLConnection conexion = (HttpURLConnection) apiNews.openConnection();
            //tipo de metodo
            conexion.setRequestMethod("GET");
            conexion.connect();
            //identificar el método que nos responde
            if(conexion.getResponseCode() != 200){//si no es uno tipo 200 se lanza un eror
                throw new RuntimeException("Error" + conexion.getResponseCode());
            }
            else {
                //"getInputStream()" datos que responde el servidor
                //"new InputStreamReader" pasa los datos a bytes
                //"BufferedReader" vuelve los datos a String para mejorar la eficiencia en lectura
                BufferedReader buf = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
                //la linea iteradora
                String lineaALinea;
                //elemento "StringBuilder" para almacenar lo objetino
                StringBuilder data = new StringBuilder();
                //leerá cada línea de texto de "BufferedReader" y lo almacena en "data" en caso que se acaben las lineas se sale
                while ((lineaALinea = buf.readLine())!=null){
                    data.append(lineaALinea);
                }
                //cierra el "BufferedReader"
                buf.close();
                //pasar los datos de "data.toString()" a un array
                JSONArray arrayNoticias = new JSONArray(data.toString());
                //lista donde que se genera con lo objetos
                List<ApiResponseNews> listaNoticias = new ArrayList<>();
                //iterar la lista "arrayNoticias" para agregar "objetoApiResponseNews" para que se un objeto
                for (int i = 0; i < arrayNoticias.length(); i++) {
                    JSONObject noticia = arrayNoticias.getJSONObject(i);
                    ApiResponseNews item = new ApiResponseNews(
                            noticia.getString("titulo"),
                            noticia.getString("descripcion"),
                            noticia.getString("fuente"),
                            noticia.getString("pais")
                    );
                    listaNoticias.add(item);
                }
                return listaNoticias;
            }
        }

        //errores que se pueden generar
        //consulta mal hecha
        catch (MalformedURLException e) {
            System.out.println("consulta errone"+ e.getMessage());
            e.printStackTrace();
        }
        //consulta de método equivocado o invalido
        catch (ProtocolException e) {
            System.out.println("consulta de método invalida"+ e.getMessage());
            throw new RuntimeException(e);
        }
        //consulta con problemas de red o lectura de datos
        catch (IOException e) {
            System.out.println("problemas de red o fallo de lectura"+ e.getMessage());
            throw new RuntimeException(e);
        }
        return null;
    }
}
