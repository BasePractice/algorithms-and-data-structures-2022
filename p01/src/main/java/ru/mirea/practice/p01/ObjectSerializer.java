package ru.mirea.practice.p01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public final class ObjectSerializer {
    private ObjectSerializer() {
    }

    public static <T extends Serializable> byte[] serialize(T object) throws IOException {
        try (ByteArrayOutputStream bytes = new ByteArrayOutputStream(); ObjectOutputStream stream = new ObjectOutputStream(bytes)) {
            stream.writeObject(object);
            stream.flush();
            return bytes.toByteArray();
        }
    }

    @SuppressWarnings({"unchecked"})
    public static <T extends Serializable> T deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        try (InputStream bis = new ByteArrayInputStream(bytes); ObjectInputStream stream = new ObjectInputStream(bis)) {
            return (T) stream.readObject();
        }
    }
}
