

function showInputAlert() {
    const RESOLUTION_1K = 1920 * 1080;
    const RESOLUTION_2K = 2560 * 1440;
    const RESOLUTION_4K = 3840 * 1160;
    const RESOLUTION_8K = 7680 * 4320;
    const STANDARD_RESOLUTION_PER_INCH = RESOLUTION_1K / 24;
    // 获取用户输入的姓名
    var userInput = document.getElementById("nameInput").value;
    const result1k = RESOLUTION_1K / userInput >= STANDARD_RESOLUTION_PER_INCH;
    const result2k = RESOLUTION_2K / userInput >= STANDARD_RESOLUTION_PER_INCH;
    const result4k = RESOLUTION_4K / userInput >= STANDARD_RESOLUTION_PER_INCH;
    const result8k = RESOLUTION_8K / userInput >= STANDARD_RESOLUTION_PER_INCH;


    // 如果用户输入了内容，则显示弹窗
    if (userInput.trim() !== "") {
        alert("result1k: " + result1k);
    } else {
        alert("请输入有效的姓名.");
    }
}


