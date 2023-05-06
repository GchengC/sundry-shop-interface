function checkPasswordStrength(password) {
    const passwordStrength = document.getElementById('password-strength');
    const strongRegex = new RegExp('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?=.{8,})');
    const mediumRegex = new RegExp('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{6,})');

    if (strongRegex.test(password)) {
        passwordStrength.innerHTML = '<span class="text-success">Strong</span>';
    } else if (mediumRegex.test(password)) {
        passwordStrength.innerHTML = '<span class="text-warning">Medium</span>';
    } else {
        passwordStrength.innerHTML = '<span class="text-danger">Weak</span>';
    }
}

document.getElementById('password').addEventListener('input', function() {
    checkPasswordStrength(this.value);
});
