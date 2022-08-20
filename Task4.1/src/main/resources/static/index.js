angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/kauppa/';

    $scope.loadProduct = function () {
        $http.get(contextPath + '/prisma')
            .then(function (response) {
                $scope.ProductList = response.data;
            });
    };

    $scope.deleteProduct = function (productId) {
        $http.get(contextPath + '/prisma/delete/' + productId)
            .then(function (response) {
               $scope.loadProduct();
            });
    }

    $scope.changeScore = function (productId, delta) {
        $http({
            url: contextPath + '/prisma/change_score',
            method: 'GET',
            params: {
                productId: productId,
                delta: delta
            }
        }).then(function (response) {
            $scope.loadProduct();
        });
    }

    $scope.loadProduct();
});