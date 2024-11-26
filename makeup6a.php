<?php

$servername = "localhost";
$username = "root";  
$password = "ekisha";  
$dbname = "makeup_school";


$conn = new mysqli($servername, $username, $password, $dbname);


if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}


$sql = "SELECT id, name, course, email, start_date FROM students";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
   
    while($row = $result->fetch_assoc()) {
        echo "ID: " . $row["id"] . "<br>";
        echo "Name: " . $row["name"] . "<br>";
        echo "Course: " . $row["course"] . "<br>";
        echo "Email: " . $row["email"] . "<br>";
        echo "Start Date: " . $row["start_date"] . "<br><br>";
    }
} else {
    echo "No students found.";
}


$conn->close();
?>
