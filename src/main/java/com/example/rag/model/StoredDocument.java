package com.example.rag.model;

import jakarta.persistence.*;

@Entity
@Table(name = "documents")
public class StoredDocument {

    @Id
    @Column(length = 36)
    private String id;

    @Column(nullable = false)
    private String userId;

    private String fileName;

    @Column(nullable = false)
    private int chunkCount;

    public StoredDocument() {}

    public StoredDocument(String id, String userId, String fileName, int chunkCount) {
        this.id = id;
        this.userId = userId;
        this.fileName = fileName;
        this.chunkCount = chunkCount;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public int getChunkCount() { return chunkCount; }
    public void setChunkCount(int chunkCount) { this.chunkCount = chunkCount; }
}