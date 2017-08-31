package org.fahad.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FileStorageMetadata implements Serializable{
	private static final long serialVersionUID = 1234567891011121314L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long fileId;
	
	@Column(nullable = false)
	private Long fileSize;
	
	@Column(nullable = false)
	private String fileName;
	
	@Column
	private String location;
	
	@Column(nullable = false)
	private Long uploadDate;

	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	public Long getFileSize() {
		return fileSize;
	}
	
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getUploadDate() {
		return uploadDate;
	}
	
	public void setUploadDate(Long uploadDate) {
		this.uploadDate = uploadDate;
	}
	
}
