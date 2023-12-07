package hw4.book;


//У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных.
//Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
//Формат сдачи: воспользуйтесь одним из вариантов: Ссылка на репозиторий Git или Прикрепленный архив
//Письменное задание 1 можно также разместить в репозитории или разместить текстом в окне сдачи практического задания.

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private BookService bookService;

    @Test
    void testFindBookById() {
        String bookId = "1";
        Book expectedBook = new Book("1", "Книга1", "Автор1");
        Mockito.when(bookRepository.findById(bookId)).thenReturn(expectedBook);
        Book result = bookService.findBookById(bookId);
        assertEquals(expectedBook, result);
    }

    @Test
    void testFindAllBooks() {

        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Книга1", "Автор1"),
                new Book("2", "Книга2", "Автор2")
        );
        Mockito.when(bookRepository.findAll()).thenReturn(expectedBooks);
        List<Book> result = bookService.findAllBooks();
        assertEquals(expectedBooks, result);
    }
}


