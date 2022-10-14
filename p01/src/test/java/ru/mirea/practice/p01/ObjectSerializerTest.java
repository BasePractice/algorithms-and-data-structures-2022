package ru.mirea.practice.p01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Сериализация/Десериализация")
final class ObjectSerializerTest {

    @DisplayName("Сериализация")
    @Test
    void serialize() throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.name = "Name1";
        student.group = "Group1";
        student.position = -1;
        byte[] serialize = ObjectSerializer.serialize(student);
        Student deserialize = ObjectSerializer.deserialize(serialize);
        assertEquals(student.name, deserialize.name);
        assertEquals(student.group, deserialize.group);
        assertEquals(student.position, deserialize.position);

        Student[] students = new Student[]{student};
        serialize = ObjectSerializer.serialize(students);
        Student[] studentsDes = ObjectSerializer.deserialize(serialize);
        assertEquals(students[0], studentsDes[0]);
    }

    private static final class Student implements Serializable {
        String name;
        String group;
        long position;

        @Override
        public int hashCode() {
            return Objects.hash(name, group, position);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Student student = (Student) o;
            return position == student.position && name.equals(student.name) && group.equals(student.group);
        }
    }
}