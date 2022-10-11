/*
@author: Juan Sebastian Bolanos 
@date: 10/11/2022
*/
const elevetorAlgorithm = (arrayFloor, initialFloor, joinFloor, direction)=>{
const subiendo = direction[0];
const bajando = direction[1];
//Valida que arreglo de pisos no este vacio
if(arrayFloor.length===0){
    console.log('The number of floors array cannot be empty');
}

//Valida que no le pase un valor distinto a numerico
let validateNumber = arrayFloor.filter(index =>{
    if( typeof index !== 'number'){
            console.log('The array cannot have values ​​other than numeric.');
    }
})
validateNumber;

//Valida que el piso inicial no sea un valor distinto a numerico y que tampoco este vacio
if (typeof initialFloor !== "number") {
    console.log('The initial floor cannot have a value other than numeric and cannot be empty either.');
}

//Valida que arreglo de direccion del ascencsor no este vacio
if(direction.length===0){
    console.log('The direction of floors array cannot be empty');
}
//Valida que no le pase un valor distinto a texto
let validateString = arrayFloor.filter(index =>{
    if( typeof index !== 'string'){
            console.log('The array cannot have values ​​other than string.');
    }
})
validateString;

let maxFloorJoined = Math.max(...arrayFloor);
for (let index = initialFloor; index <= maxFloorJoined; index++) {
    console.log('Elevador en piso', index);
    if(index===initialFloor){
        console.log('Elevador '+subiendo);
    }
    let validateFloorUp = joinFloor.hasOwnProperty(index);
    if(validateFloorUp){
        console.log('Elevador se detiene');
        console.log('Piso ingresado', joinFloor[index]);
        if(index===maxFloorJoined){
            console.log('Elevador '+bajando);
        }else{
        console.log('Elevador '+subiendo);
        }
    }
}
for (let index = maxFloorJoined-1; index > 0; index--) {
    console.log('Elevador en piso', index);
    let valuesObject = Object.values(joinFloor).reverse();
    const unicos = [... new Set(valuesObject)];
    unicos.forEach(element => {
        if(element==index){
            const valueMinFloor = Math.min.apply(null, Object.values(joinFloor));
            if(index===valueMinFloor){
                console.log('Elevador se detiene');
            }else{
                console.log('Elevador se detiene'); 
                console.log('Elevador '+bajando);}
        }
    });

}

}

let arrayFloor = [5,29,13,10];
let initialFloor = 4;
let joinFloor = {5:2,29:10,13:1,10:1};
let direction = ['subiendo', 'descendiendo'];

elevetorAlgorithm(arrayFloor, initialFloor, joinFloor, direction);
