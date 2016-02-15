/**
 * Created by gcDataTechnology on 1/22/2016.
 */


recipeApp.controller("manageIngredients", function($scope,$http,$modal,IngredientEditor) {
//recipeApp.controller("manageIngredients", function($scope,$http,$modal) {
    $scope.editor = new IngredientEditor();

    $scope.editor.modalController = $modal;
    $scope.editor.hideEdit = true;


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
});

recipeApp.factory('IngredientEditor',function($scope,$modal){
    var editor = function(){
        this.ingredientToEdit = {'id':0,'ingredientname':'needAName','ingredienttype':0};
        this.ingredientToMake = {'id':0,'ingredientname':'newIngredient','ingredienttype':0};
    };



    editor.prototype.editIngredient = function(id,name,type){

    //$scope.editIngredient = function(id,name,type){
    //$scope.editIngredient = function(ingredient){ //unable to pass in the actual ingredient with attributes
        var editModal = this.modalController;

        console.log("editIngredient():: ",name);
        //$scope.ingredientToEdit.id = id;
        //$scope.ingredientToEdit.ingredientname = name;
        //$scope.ingredientToEdit.ingredienttype = type;
        var myid = id;
        var myname = name;
        var mytype = type;

        //console.log("editIngredient():: ",$scope.ingredientToEdit.ingredientname);
        console.log("var id:: ",myid);
        //$scope.hideEdit = false;
        //$scope.toggleHideEdit();
        //$scope.editId = id;
        //$scope.newName = name;
        //$scope.newType = type;

        //var ingredient = $scope.ingredientToEdit;//was undefined in the modal controller
        var modalInstance = editModal.open({
            templateUrl: 'editIngredientModal.html',
            controller: 'editIngredientModalController',
            resolve:{
                myname : function(){
                    return myname;
                },
                mytype : function(){
                    return mytype;
                },
                myid : function(){
                    return myid;
                }
            }

        });

        modalInstance.result.then(function(id){
            console.log("result id:: ",id);
        });


    };

    return editor;

});
//example of js calling groovy controller
//var urlShareCollection = 'shareCollection.json?jsonp=JSON_CALLBACK&id=' + $scope.collectionID + "&imageFormat=" + $scope.imageFormat +
    //'&sendTo=' + $scope.shareWith + '&emailSubject=Imagebank Collection Shared' + '&emailBody=' + $scope.emailBody + "&fileName=" + $scope.fileName;
//groovy controller gets by params.id params.emailBody etc


recipeApp.controller('editIngredientModalController', function($scope,$http,$modalInstance,myid,myname,mytype) {

    //$scope.id = ingredient.id;
    //$scope.ingredientname = ingredient.name;
    //$scope.ingredienttype = ingredient.type;
    //console.log("ingredient :: ",ingredient);
    console.log("myid:: ",myid);

    $scope.ingredientToEdit.id = myid;
    $scope.ingredientToEdit.ingredientname = myname;
    $scope.ingredientToEdit.ingredienttype = mytype;

    console.log("Modal:: ");

    $scope.ok = function(){
        $modalInstance.dismiss('ok');
    }

    $scope.cancel = function () {
        $modalInstance.dismiss('cancel');
    };

});