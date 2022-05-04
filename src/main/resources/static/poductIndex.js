angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';

    $scope.loadProducts = function () {
        $http.get(contextPath + '/product/all')
            .then(function (response) {
                $scope.productList = response.data;
            });
    };

//    $scope.changeScore = function (clientId, delta){
//        $http({
//            url: contextPath + '/client/change_score',
//            method: 'GET',
//            params: {
//                clientId: clientId,
//                delta: delta
//            }
//        }).then(function (response){
//            $scope.loadClients();
//        });
//    };
               ////////////////////////////////////////////////////////////

    $scope.addProductIntoCart = function (productId){
            $http({
                url: contextPath + '/cart/add',
                method: 'GET',
                params: {
                    productId: productId
                }
            }).then(function (response){
                $scope.loadCart();
            });

    };

    $scope.loadProducts();

});