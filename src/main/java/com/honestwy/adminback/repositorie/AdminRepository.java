package com.honestwy.adminback.repositorie;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.google.cloud.firestore.Firestore;
import com.honestwy.adminback.dto.Admin;

@Repository
public class AdminRepository {

    private final Firestore firestore;
    private static final String COLLECTION = "admins";

    public AdminRepository(Firestore firestore) {
        this.firestore = firestore;
    }

    public Optional<Admin> findByEmail(String email) throws Exception {

        return firestore.collection(COLLECTION)
                .whereEqualTo("email", email)
                .get()
                .get()
                .getDocuments()
                .stream()
                .findFirst()
                .map(doc -> doc.toObject(Admin.class));
    }

    public void save(Admin admin) {
        firestore.collection(COLLECTION)
                .document(admin.getId())
                .set(admin);
    }
}

