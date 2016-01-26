<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title><g:layoutTitle default="Recipe"/></title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <asset:stylesheet src="application.css"/>


        <g:layoutHead/>
    </head>
    <body ng-app="recipeApp">
        <div id="appLogo" class="header logo" role="banner">

            <div >
                <a href="grails-app/tblingredient/index"><asset:image src="food91x60.jpg" alt="appLogo" class="logo"/></a>
                <div class="smallPanel">
                    <div class="rightSide">
                        <g:link uri="main">Mangage Recipes</g:link>
                    </div>
                    <div class="rightSide">
                        <g:link uri="/ingredient/index">Mangage Ingredients</g:link>
                    </div>

                </div>
            </div>


        </div>
        <g:layoutBody/>
        <div class="footer" role="contentinfo"></div>
        <div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>

        <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
        <asset:javascript src="application.js"/>
    </body>
</html>
