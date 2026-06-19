package Collection.Generic.DZ;

public class DoubleBox<T> {
    private RandomBox<T> first;
    private RandomBox<T> second;

    public boolean put(int key, T value) {
        // Если первый слот пуст, создаём новый RandomBox и помещаем в first
        if (first == null) {
            first = new RandomBox<>(key, value);
            return true;
        }
        // Если второй слот пуст (а первый уже занят), помещаем во second
        else if (second == null) {
            second = new RandomBox<>(key, value);
            return true;
        }
        // Оба слота заняты — не можем добавить, возвращаем false
        else {
            return false;
        }
    }

    public T get(int key) {
        T result = null;

        // Пробуем получить значение из первого RandomBox
        if (first != null) {
            result = first.tryUnlock(key);
        }
        // Если в первом не нашли и второй существует, пробуем второй
        if (result == null && second != null) {
            result = second.tryUnlock(key);
        }

        return result;
    }

    public int size() {
        int count = 0;
        // Считаем занятые слоты: +1 если first не null
        if (first != null) count++;
        // +1 если second не null
        if (second != null) count++;
        return count;
    }
}
