
async function informacion(){
    try {
        const response = await fetch('/v1/Plataforma/estadistica/informacion');
        const data = await response.json();

        console.log(data)
        const labelsJuego = [data.nombreJuego || 'Juego desconocido'];
        const puntajeJuego = [data.puntajeJuego];

        const labelsCategoria = [data.nombreCategori || 'Categoría desconocida'];
        const puntajeCategoria = [data.puntajeCategoria];

        mostrarGraficaPuntajeJuego(labelsJuego, puntajeJuego);
        mostrarGraficaPuntajeCategoria(labelsCategoria, puntajeCategoria);
    }
    catch (error){
        console.log("No se pudo obtener datos", error);
    }
}

function mostrarGraficaPuntajeJuego (labels, datos){
    const graficaJuegos = document.getElementById('graficaJuegos').getContext('2d');
    new Chart(graficaJuegos, {
        type: 'bar',
        data: {
            labels: labels, //Valores eje x
            datasets: [{
                label: 'Puntaje por Juego',
                data: datos,
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    });
}

function mostrarGraficaPuntajeCategoria(labels, datos) {
    const graficaCategorias = document.getElementById('graficaCategorias').getContext('2d');
    new Chart(graficaCategorias, {
        type: 'bar',
        data: {
            labels: labels, // Valores eje x
            datasets: [{
                label: 'Puntaje por Categoría',
                data: datos, // Pasamos "datos" correctamente
                backgroundColor: 'rgba(153, 102, 255, 0.2)',
                borderColor: 'rgba(153, 102, 255, 1)',
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    });
}

window.onload = function() {
    informacion();
};
