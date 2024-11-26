<?php

$xml = simplexml_load_file('makeup_students6b.xml');

if ($xml === false) {
    echo "Failed to load XML file.";
    exit;
}

foreach ($xml->student as $student) {
    echo "ID: " . $student->id . "<br>";
    echo "Name: " . $student->name . "<br>";
    echo "Course: " . $student->course . "<br>";
    echo "Email: " . $student->email . "<br>";
    echo "Start Date: " . $student->start_date . "<br><br>";
}
?>
