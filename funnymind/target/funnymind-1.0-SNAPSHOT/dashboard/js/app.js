
let currentIndex = 1;

function showSlide(index) {
  const slides = document.querySelectorAll('.carousel img');
  if (index < 1) {
    currentIndex = slides.length;
  } else if (index > slides.length) {
    currentIndex = 1;
  }

  slides.forEach(slide => {
    //slide.style.width = "40%";
    slide.style.transform = `translateX(-${100 * (currentIndex - 1)}%)`;
  });
}

function nextSlide() {
  showSlide(++currentIndex);
}

function prevSlide() {
  showSlide(--currentIndex);
}

showSlide(currentIndex);

