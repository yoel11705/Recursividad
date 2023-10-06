<?php
$numeroTerminos = 10;

$a = 0;
$b = 1;

echo "Por favor ingrese la cantidad de elementos para la serie: ";
$n = intval(fgets(STDIN));

for ($i = 0; $i < $n; $i++) {
    echo $a . PHP_EOL;

    $c = $a + $b;
    $a = $b;
    $b = $c;
}
?>
