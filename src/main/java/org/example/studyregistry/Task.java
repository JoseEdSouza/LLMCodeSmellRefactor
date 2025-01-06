package org.example.studyregistry;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task extends Registry {
    private String title;
    private String description;
    private String author;
    private LocalDateTime date;

    public Task(String title, String description, String author, LocalDateTime date) {
        this.title = title;
        this.name = title;
        this.description = description;
        this.author = author;
        this.date = date;
    }

    // Encapsulated Behavior: Check if task is overdue
    public boolean isOverdue() {
        return LocalDateTime.now().isAfter(date);
    }
    // Encapsulated Behavior: Get task age in days
    public long getAgeInDays() {
        Duration duration = Duration.between(date, LocalDateTime.now());
        return duration.toDays();
    }
    // Encapsulated Behavior: Format task for display
    public String getFormattedTask() {
        return String.format("%s - %s by %s", title, date, author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(title, task.title) &&
                Objects.equals(description, task.description) &&
                Objects.equals(author, task.author) &&
                Objects.equals(date, task.date);
    }
    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, description, author, date);
    }
}
