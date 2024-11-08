function updateClock() {
    const now = new Date();
    const hours = String(now.getHours()).padStart(2, '0');
    const minutes = String(now.getMinutes()).padStart(2, '0');
    const seconds = String(now.getSeconds()).padStart(2, '0');
    document.getElementById('clock').innerText = `${hours}:${minutes}:${seconds}`;
}
setInterval(updateClock, 1000);
updateClock(); 

function changeBackground() {
    const heroSection = document.querySelector('.hero-section');
    
    if (heroSection.style.background.includes('#ff9a9e')) {
        heroSection.style.background = 'linear-gradient(to right, #ff69b4, #c71585)';
    } else {
        heroSection.style.background = 'linear-gradient(to right, #ff9a9e, #fad0c4)';
    }
}


const hoverTexts = document.querySelectorAll('.hover-text-change');
hoverTexts.forEach(text => {
    text.addEventListener('mouseover', function () {
        this.innerText = 'Check Out These Fabulous Offers!';
    });
    text.addEventListener('mouseout', function () {
    
        if (this.innerText === 'Check Out These Fabulous Offers!') {
            this.innerText = 'Glamorous Lipstick Collection - "Turn Heads with Every Smile"';
        }
    });
});
