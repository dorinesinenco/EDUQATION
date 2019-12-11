const path = require('path');

module.exports = {
    entry: './src/navbar/navbar.js',
    output: {
        path: path.resolve(__dirname, 'dist'),
        filename: 'bundle.js'
    },
    /* ??? */
};