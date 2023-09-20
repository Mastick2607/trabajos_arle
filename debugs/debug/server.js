const express = require('express');
const app = express();

app.get('/', (req, res) => {
    const num1 = 5;
    const num2 = '10';


    const sum = num1 + parseInt (num2);
    res.send(`La suma de ${num1} y ${num2} es: ${sum}`);
});

app.listen(3000, ()  => {
    console.log('Server is running on port 3000');
});
