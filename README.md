[![Build Status](https://github.com/vasslin/Programming-Technologies-Part-2/actions/workflows/main.yml/badge.svg)](https://github.com/vasslin/Programming-Technologies-Part-2/actions/workflows/main.yml)


# Техническое задание №2
### Технологии программирования, НИУ ВШЭ


В рамках задания проделана работа:
- [x] реализована функцияи чтения из файла, поиска минимального числа, поиска максимального числа, сложения и умножения всех чисел из файла.
  *описание*: програма принимает на вход два параметра ```mode``` - целевой режим (max, min, mult, sum) и ```file``` - название файла.
  Программа заполняет массив arr содержимым ```file``` и передает его в качестве аргумента функциям.
  Реализованы функции:
  - ```_min``` (минимальное число)
  - ```_max``` (максимальное число)
  - ```_sum``` (сумма всех чисел)
  - ```_mult``` (произведение всех чисел)

- [x]  реализованы тесты для проверки корректности функций поиска минимума, максимума, сложения и умножения
- [x] реализованы тесты  для проверки скорости работы программы при увеличении размера входного файла (для каждой из функций: поиск минимума, максимума, сложение и умножение)
- [x] релизован тест для проверки кореектности работы функции ```_mult``` на отрицательных числах
*open src/test/java/MainTest.java to see all tests*
- [x] построен график зависимости времени выполнения функции ```_sum``` от кол-ва чисел в файле`(see "time chart.jpeg")
- [x] проект загружен в репозиторий, оформлен README.md
- [x] подключена CI-система Github Actions
- [x] тесты автоматически запускаются при каждом добавленном коммите и новом pull_request на ветке master
- [x] добавлен бэйдж README.md, показывающий текущий статус тестов
- [x] сделана интеграция CI-системы и мессенджера telegram: https://t.me/+yOSXgF5LYlU2M2Yy  