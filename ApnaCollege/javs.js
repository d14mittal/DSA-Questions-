var a=111;
const b=100;
(function(){
    b=101;
    a=100;
})();
console.log(b);
console.log(a);