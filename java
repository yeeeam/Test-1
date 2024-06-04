document.addEventListener("DOMContentLoaded", () => {
    const loginLink = document.getElementById("login-link");
    const loginModal = document.getElementById("login-modal");
    const closeButton = document.querySelector(".close-button");
    const loginForm = document.getElementById("login-form");

    loginLink.addEventListener("click", () => {
        loginModal.style.display = "block";
    });

    closeButton.addEventListener("click", () => {
        loginModal.style.display = "none";
    });

    window.addEventListener("click", (event) => {
        if (event.target === loginModal) {
            loginModal.style.display = "none";
        }
    });

    loginForm.addEventListener("submit", (event) => {
        event.preventDefault();
        const username = document.getElementById("username").value;
        const password = document.getElementById("password").value;

        // 模擬登入驗證
        if (username === "user" && password === "password") {
            window.location.href = "0603.html"; // 登入成功後重定向的頁面
        } else {
            alert("使用者名稱或密碼錯誤");
        }
    });
});
