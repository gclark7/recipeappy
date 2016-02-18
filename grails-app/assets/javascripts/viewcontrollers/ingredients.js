/**
 * Created by gcDataTechnology on 1/22/2016.
 */
recipeApp.controller("manageIngredients",function($scope,$http,$modal,IngredientEditor) {
//recipeApp.controller("manageIngredients", function($scope,$http,$modal) {
//     $scope.modalController = $modal;
     $scope.editor = new IngredientEditor();

     $scope.editor.modalController = $modal;
   // $scope.editor.modalController = $uibModal;
   // $scope.editor.hideEdit = true;

    //$scope.fnAlert = function(){
    //    alert("grr");
    //}

    //$scope.toggleHideEdit = function(){
    //
    //    if($scope.hideEdit){
    //        console.log("hide = false");
    //        $scope.hideEdit = false;
    //    }else{
    //        $scope.hideEdit = true;
    //        console.log("hide = true");
    //    }
    //}

    //$scope.ingredientToEdit = {'id':0,'ingredientname':'needAName','ingredienttype':0};
    //$scope.editId = '';
    //$scope.newName = '';
    //$scope.newType = 0;
    //$scope.editIngredient = function(id,name,type){
    //
    //    alert("do nothig");
    //}
});

recipeApp.factory('IngredientEditor',function($http, $modal){
    var editor = function(){
        this.ingredientToEdit = {'id':0,'ingredientname':'needAName','ingredienttype':0};
        this.ingredientToMake = {'id':0,'ingredientname':'newIngredient','ingredienttype':0};
    };
////
////
////
    editor.prototype.editIngredient = function(id,name,type){
        //alert("wasUP");

         var ingredientToEdit = this.ingredientToEdit;
         ingredientToEdit.id = id;
         ingredientToEdit.ingredientname = name;
         ingredientToEdit.ingredienttype = type;
        var editModal = this.modalController;

              modalInstance = editModal.open({
              templateUrl: 'editIngredientModal.html',
              controller: 'editIngredientModalController',
              size:"lg",

              //resolve: {
              //          myid: function(){
              //               return id;
              //          },
              //          myname: function(){
              //               return name;
              //          },
              //          mytype: function(){
              //               return type;
              //          }
              //
              //     }

              resolve: {
                   editIngredient: function(){
                        return ingredientToEdit;
                   }

              }


              });

        modalInstance.result.then(function(id){
            console.log("result id:: ",id);
        });
////
////
    };
//
    return editor;
//
});



//recipeApp.controller('editIngredientModalController', function($scope,$http) {
// recipeApp.controller('editIngredientModalController', function($scope, $http, $modalInstance, myid, myname, mytype){
//recipeApp.controller('editIngredientModalController', function($scope,$http) {
//recipeApp.controller('editIngredientModalController', function($scope, $http, myid, myname, mytype){
recipeApp.controller('editIngredientModalController', function($scope,$http, $modalInstance, editIngredient) {
//    //$scope.id = ingredient.id;
//    //$scope.ingredientname = ingredient.name;
//    //$scope.ingredienttype = ingredient.type;
//    //console.log("ingredient :: ",ingredient);
//    console.log("myid:: ",myid);
//
//     $scope.myid = myid;
//     $scope.myname = myname;
//     $scope.mytype = mytype;
//
//    $scope.ingredientToEdit.id = myid;
//    $scope.ingredientToEdit.ingredientname = myname;
//    $scope.ingredientToEdit.ingredienttype = mytype;
     $scope.ingredientToEdit = editIngredient;
//    //
//    //console.log("Modal:: ");
//    //
    $scope.ok = function(){
        $modalInstance.dismiss('ok');
         console.log($scope.ingredientToEdit);
    }

    $scope.cancel = function () {
        $modalInstance.dismiss('cancel');
         console.log($scope.ingredientToEdit);
    };
//
});