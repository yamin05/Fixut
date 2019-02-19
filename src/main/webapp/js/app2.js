'use strict';

var app = angular.module('myApp', ['ngRoute', 'ngSanitize', 'pascalprecht.translate']);

app.controller('Ctrl', ['$translate', '$scope', function ($translate, $scope) {

  $scope.changeLanguage = function (langKey) {
    $translate.use(langKey);
  };
}]);
