angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';

    $scope.loadCart = function () {
            $http.get(contextPath + '/cart/all')
                .then(function (response) {
                    $scope.cartList = response.data;
            });
    };

    $scope.deleteProductFromCart = function (productId) {
                $http.get(contextPath + '/cart/delete_product/' + productId)
                    .then(function (response) {
                        $scope.loadCart();
                });
    }

    $scope.loadCart();

});