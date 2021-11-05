 public class Book implements Comparable<Book> {

        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String toString() {
            return String.format("%s was written by %s", title, author);
        }

        public int compareTo(Book other){
            if(this.author.compareTo(other.author) == 0) {
                return this.title.compareTo(other.title);
            }
            return this.author.compareTo(other.author);
        }
    }

