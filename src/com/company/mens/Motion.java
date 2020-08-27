package com.company.mens;

public interface Motion {
    void moveForward();//метод двигаться вперед
    void moveBackward();//метод двигаться назад
    int attack();//метод атака
    int defend();//метод защита
    void pass();//метод передачи
    void inPass(com.company.objects.Object o);//метод приема
}
