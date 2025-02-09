//JsFiddle
//html code to explain stopPropogation use
// <div id="div" style="width: 100px; height: 100px; background: green;">
// <button id="btn">
// Click
// </button>
// </div>

//JS Code
const div = document.getElementById("div");
const btn = document.getElementById("btn");

div.addEventListener("click", (e) => {
console.log('Div')
})

btn.addEventListener("click", (e) => {
/* e.stopPropagation(); */
console.log('Btn')
})
