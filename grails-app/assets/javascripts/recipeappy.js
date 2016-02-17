/**
 * Created by gcDataTechnology on 1/22/2016.
 */
var recipeApp = angular.module('recipeApp',['ui.bootstrap']);

recipeApp.factory('IngredientEditor',function(){
    var editor = function(){
        this.ingredientToEdit = {'id':0,'ingredientname':'needAName','ingredienttype':0};
        this.ingredientToMake = {'id':0,'ingredientname':'newIngredient','ingredienttype':0};
    };
//
//
//
    editor.prototype.editIngredient = function(id,name,type,modalController){
        alert("wasUP");
//    //$scope.editIngredient = function(id,name,type){
//    //$scope.editIngredient = function(ingredient){ //unable to pass in the actual ingredient with attributes
//        //var editModal = this.modalController;
        var editModal = modalController;
//
//        console.log("editIngredient():: ",name);
//        //$scope.ingredientToEdit.id = id;
//        //$scope.ingredientToEdit.ingredientname = name;
//        //$scope.ingredientToEdit.ingredienttype = type;
//        var myid = id;
//        var myname = name;
//        var mytype = type;
//
//        //console.log("editIngredient():: ",$scope.ingredientToEdit.ingredientname);
//        console.log("var id:: ",myid);
//        //$scope.hideEdit = false;
//        //$scope.toggleHideEdit();
//        //$scope.editId = id;
//        //$scope.newName = name;
//        //$scope.newType = type;
//
//
//        var ingredient = $scope.ingredientToEdit;//was undefined in the modal controller
        var modalInstance = editModal.open({
            templateUrl: 'editIngredientModal.html',
            controller: 'editIngredientModalController',
            //resolve:{
            //    myname : function(){
            //        return myname;
            //    },
            //    mytype : function(){
            //        return mytype;
            //    },
            //    myid : function(){
            //        return myid;
            //    }
            //}

        });

        modalInstance.result.then(function(id){
            console.log("result id:: ",id);
        });
//
//
    };
//
    return editor;

});

