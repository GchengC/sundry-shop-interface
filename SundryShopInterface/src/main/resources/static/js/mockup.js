function toggleDarkMode() {
    const body = document.querySelector('body');
    const darkModeStylesheet = document.getElementById('dark-mode-stylesheet');
    const isEnabled = body.classList.toggle('dark-mode');
    darkModeStylesheet.disabled = !isEnabled;
}
