// non-destructive method = do not change original value . ex:  toUpperCase() , toLowerCase() , trim()

// const promise = new Promise((resolve, reject)=>{

// })

// document.getElementById('mybtn').addEventListener('click', ()=>{
//     promise.then(()=>{
//         console.log("hey")
//     }).catch((error)=>{
//         console.log(error)
//     }) 
// })


// var a= 100;
// function fun(){
//    var a=200;
//     console.log(a);
// }
// fun();
// console.log(a);


// --------------------------------------------CALLBACK--------------------------------------------

// function fun(f){
//     f();
// }

// fun(function(){
//     console.log("Hello")
// } )

const arr = [1,2,3,4,5];

// const ans=arr.map((item)=>console.log (item*item))

// console.log("ans : ", ans)

const filteredarr=arr.filter((item)=>{
    return item > 3
})

console.log(filteredarr);