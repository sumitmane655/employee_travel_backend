package com.employeeTravel.main.domain;

import java.util.Arrays;
import java.util.Objects;

public class DocumentsDetails {
	private int documentId;
	private String documentName;
	private String documentType;
	private byte[] uploadFile;
	
	public DocumentsDetails() {
		// TODO Auto-generated constructor stub
	}

	public DocumentsDetails(int documentId, String documentName, String documentType, byte[] uploadFile) {
		super();
		this.documentId = documentId;
		this.documentName = documentName;
		this.documentType = documentType;
		this.uploadFile = uploadFile;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public byte[] getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(byte[] uploadFile) {
		this.uploadFile = uploadFile;
	}

	@Override
	public String toString() {
		return "DocumentsDetails [documentId=" + documentId + ", documentName=" + documentName + ", documentType="
				+ documentType + ", uploadFile=" + Arrays.toString(uploadFile) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(uploadFile);
		result = prime * result + Objects.hash(documentId, documentName, documentType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentsDetails other = (DocumentsDetails) obj;
		return documentId == other.documentId && Objects.equals(documentName, other.documentName)
				&& Objects.equals(documentType, other.documentType) && Arrays.equals(uploadFile, other.uploadFile);
	}

	
}
