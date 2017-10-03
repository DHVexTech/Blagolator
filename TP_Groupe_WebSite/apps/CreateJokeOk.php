<?php
$category = $_POST["Category"];
$deb = $_POST["Deb"];
$fin = $_POST["Fin"];
$description = $deb." !! ".$fin;
 
//API Url
$url = 'http://10.8.110.213:8080/joke/create';
 
//Initiate cURL.
$ch = curl_init($url);
 
//The JSON data.
$jsonData = array(
    'category' => $category,
    'description' => $description
);
 
//Encode the array into JSON.
$jsonDataEncoded = json_encode($jsonData);
 
//Tell cURL that we want to send a POST request.
curl_setopt($ch, CURLOPT_POST, 1);
 
//Attach our encoded JSON string to the POST fields.
curl_setopt($ch, CURLOPT_POSTFIELDS, $jsonDataEncoded);
 
//Set the content type to application/json
curl_setopt($ch, CURLOPT_HTTPHEADER, array('Content-Type: application/json')); 
 
//Execute the request
$result = curl_exec($ch);

header('Location: http://localhost/TP_Groupe_WebSite/');
?>