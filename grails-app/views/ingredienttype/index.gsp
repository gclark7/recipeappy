<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Ingredient Types</title>

    </head>
    <body>
        <div class="col-lg-12">
            <div class="indentMe">

                <g:form controller="ingredienttype" action="createIngredientType" id="formcreateType">
                    <label for="type">Ingredient Type
                    <g:textField name="type" id="type"></g:textField>
                    </label>
                    <g:submitButton name="createType" id="createType">Create Ingredient Type</g:submitButton>
                </g:form>

                <g:each in="${types}" var="type">
                    <li>${type.type}</li>
                </g:each>
                <div class="ingredientButton">
                    <span class="glyphicon glyphicon-folder-open"></span><button type="button" onclick="fnAlert()" >alert</button>
                </div>
            </div>
        </div>

    </body>
</html>
