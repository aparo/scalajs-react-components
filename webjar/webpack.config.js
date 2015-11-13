'use strict';

var webpack = require('webpack');
var CommonsChunkPlugin = webpack.optimize.CommonsChunkPlugin;

module.exports = {
    entry: {
        mui: './index.js',
        tagsInput: './js/reactTagsInputPage.js',
        selectPage: './js/reactSelectPage.js',
        geomIcons: './js/reactGeomIconsPage.js',
        infinite: './js/reactInfinitePage.js',
        spinner: './js/spinnerPage.js'
    },
    output: {
        path: __dirname + '/assets',
        publicPath: "/assets/",
        filename: '[name].js'
    },
    externals: {
        "react": "React",
        "react-dom": "ReactDOM",
        "react-addons-transition-group":"ReactTransitionGroup",
        "react-addons-pure-render-mixin":"PureRenderMixin",
        "react-addons-update":"update",
        "react-addons-create-fragment":"createFragment",
        "react-tap-event-plugin":"injectTapEventPlugin"
    },
    plugins: [
        new webpack.NoErrorsPlugin(),
        new CommonsChunkPlugin({
            name: "react-components"
        })
    ],
    module: {
        loaders: [
            {
                test: /\.css$/,
                loader: 'style-loader!css-loader'
            },

            {
                test: /\.(png|jpg|svg)$/,
                loaders: [
                    'url-loader?limit=8192',
                    'image-webpack?optimizationLevel=7&progressive=true']
            } // inline base64 URLs for <=8k images, direct URLs for the rest
        ]
    }


};