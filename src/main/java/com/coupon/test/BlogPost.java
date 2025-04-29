package com.coupon.test;


public class BlogPost {
    String title;
    String author;
    BlogPostType type;

    public BlogPost(String title, String author, BlogPostType type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BlogPostType getType() {
        return type;
    }

    public void setType(BlogPostType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BlogPost{" + "title=" + title + ", author=" + author + ", type=" + type + '}';
    }
 
}

enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}

//        List<BlogPost> posts = Arrays.asList(
//                new BlogPost("Breaking News: New Product Released", "John Doe", BlogPostType.NEWS),
//                new BlogPost("Product Review: Awesome Gadget", "Jane Smith", BlogPostType.REVIEW),
//                new BlogPost("Beginner's Guide to Java Streams", "Alice Johnson", BlogPostType.GUIDE),
//                new BlogPost("Latest Tech News: AI Advancements", "John Doe", BlogPostType.NEWS),
//                new BlogPost("Detailed Review: Camera X100", "Bob Williams", BlogPostType.REVIEW),
//                new BlogPost("Advanced Guide: Spring Boot Tutorial", "Alice Johnson", BlogPostType.GUIDE),
//                new BlogPost("News Update: Company Acquisition", "Eve Brown", BlogPostType.NEWS),
//                new BlogPost("Review of the new TV", "Jane Smith", BlogPostType.REVIEW),
//                new BlogPost("Guide to Data Structures", "Charlie Davis", BlogPostType.GUIDE)
//        );
//
//        Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
//                                .collect(groupingBy(BlogPost::getType));  
//        
//        for(BlogPostType type: postsPerType.keySet()){
//            System.out.println("BlogPost Type " + type + " " + postsPerType.get(type));
//        }