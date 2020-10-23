package ImageHoster.model;

import java.time.LocalDate;
import java.util.Date;

public class Comment {
    private int id;
    private String text;
    private LocalDate createdDate;
    private User user;
    private Image Image;

    public Comment() {
    }

    public Comment(int id, String text, LocalDate createdDate, User user, ImageHoster.model.Image image) {
        this.id = id;
        this.text = text;
        this.createdDate = createdDate;
        this.user = user;
        Image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ImageHoster.model.Image getImage() {
        return Image;
    }

    public void setImage(ImageHoster.model.Image image) {
        Image = image;
    }
}
