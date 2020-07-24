const path = require('path');

module.exports = {
	entry: './compile/index.js',
	output:{
		fileame: 'bundle.js', 
		path: path.resolve(__dirname, 'dist')
	}
}