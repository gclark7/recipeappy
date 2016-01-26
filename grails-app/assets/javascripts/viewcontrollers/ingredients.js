/**
 * Created by gcDataTechnology on 1/22/2016.
 */


recipeApp.controller('manageIngredients', ['$scope','$http', function($scope,$http) {
    $scope.hideEdit = true;

    $scope.toggleHideEdit = function(){

        if($scope.hideEdit){
            console.log("hide = false");
            $scope.hideEdit = false;
        }else{
            $scope.hideEdit = true;
            console.log("hide = true");
        }
    }

    $scope.editId = '';
    $scope.newName = '';
    $scope.newType = '';

    $scope.editIngredient = function(id,name,type){
        console.log(id,name,type);
        $scope.hideEdit = false;
        $scope.editId = id;
        $scope.newName = name;
        $scope.newType = type;
    }



}]);