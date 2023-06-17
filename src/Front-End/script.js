const app = angular.module("nmzApp", ["ngRoute"]);
app.config(function($routeProvider){

        $routeProvider.when("/",{
            templateUrl : "index.html"

        })
        .when("/Orders", {
          templateUrl: "/src/Front-End/Orders.html"
        })
        .when("/About", {
          templateUrl: "About.html"

        })
        .when("/Contact", {
            templateUrl: "Contact.html"
        })



})