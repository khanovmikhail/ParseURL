# ParseURL
JavaRush task 1527
Считать с консоли URL-ссылку.
Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert():
alert(double value) - для чисел (не забывай о том, что число может быть дробным);
alert(String value) - для строк.
Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.

ПРИМЕР 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

ПРИМЕР 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14
