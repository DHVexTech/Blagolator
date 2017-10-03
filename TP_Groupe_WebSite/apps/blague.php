<?php

$category = $_POST["Category"];


/* Afficher une variable et arrête le script pour des raisons de débogage */
function dd($data) {
    echo "<pre>";
    die(var_dump($data));
    echo "</pre><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>";
   }

/* Adresse de l'URL sur laquelle on va taper pour récuperer le contenu JSON */
$api_url = "http://10.8.110.213:8080/joke/".$category;
/* Le contenu brut (au format JSON) issu de l'API */
$api_content = file_get_contents($api_url);
/* Transformation du JSON en Tableau PHP */
$api_content_array = json_decode($api_content);

/* On affiche ce que l'on a réussi à obtenir et on s'arrête ici */

$tab = $api_content_array->content;
//dd($tab[0]);


$description = str_replace("!!", "<br>", $tab[0]->description);


require('views/blague.phtml');
?>