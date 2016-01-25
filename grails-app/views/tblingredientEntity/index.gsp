<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Welcome to Grails</title>

    </head>
    <body>
        <div>
            <g:each in="${ingredients}" var="ingredient">
                <li>${ingredient}</li>
            </g:each>
            <g:each in="${(1..10)}" var="number">
                ${number}<br/>
            </g:each>
        </div>
    </body>
</html>
