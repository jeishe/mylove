// Get the envelope elements
const envelope = document.querySelector('.envelope');
const envelopeFront = document.querySelector('.envelope-front');
const envelopeBack = document.querySelector('.envelope-back');

// Add event listeners
envelope.addEventListener('click', () => {
  // Toggle the envelope open and closed states
  envelope.classList.toggle('open');
});

// Animate the envelope opening and closing
envelopeFront.addEventListener('transitionend', () => {
  if (envelope.classList.contains('open')) {
    envelopeBack.style.display = 'block';
  } else {
    envelopeBack.style.display = 'none';
  }
});
