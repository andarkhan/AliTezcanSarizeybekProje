/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Stream;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Parameter;
import javax.persistence.TemporalType;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Ogrenci;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.AnnotationException;
import org.hibernate.CacheMode;
import org.hibernate.FlushMode;
import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.RowSelection;
import org.hibernate.query.ParameterMetadata;
import org.hibernate.query.QueryParameter;
import org.hibernate.query.QueryProducer;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.type.Type;
import view.Anasayfa;

/**
 *
 * @author atsar
 */
public class OgrenciYonetici {
    private JTable ogrenciTablo;
    private final static String SORGU_KALIP = "from Ogrenci";
    private Session session;
    private Vector<String> sutunlar=new Vector<>();
    private Vector<Object> satir;
    private DefaultTableModel model;
    
    
    public OgrenciYonetici(JTable ogrenciTablo){
        this.ogrenciTablo=ogrenciTablo;
        sutunlar.add("Öğrenci ID");
        sutunlar.add("Ögrenci No");
        sutunlar.add("Ad-Soyad");
        sutunlar.add("Şehir");
        sutunlar.add("Tel No");
        model=(DefaultTableModel)ogrenciTablo.getModel();
        model.setColumnIdentifiers(sutunlar);
    }
    
    public void ogrenciGetir(String aranan, String filtre){
        String sorguMetin="";
        if(filtre.equalsIgnoreCase("adsoyad")){
            sorguMetin=SORGU_KALIP+" where adsoyad like '%" + aranan + "%'";
        }
        else if(filtre.equalsIgnoreCase("sehir")) {
            sorguMetin = SORGU_KALIP + " where sehir like '%" + aranan + "%'";
        }
        session.beginTransaction();
        List ogrencilerList = session.createQuery(sorguMetin).list();
        session.getTransaction().commit();
        ogrenciGoster(ogrencilerList);
    }
    
    public void ac() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void kapat() {
        session.close();
    }
    public void ogrenciEkle(String ogrencino,String adsoyad,String sehir,String telno){
        session.beginTransaction();
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setOgrencino(ogrencino);
        ogrenci.setAdsoyad(adsoyad);
        ogrenci.setSehir(sehir);
        ogrenci.setTelno(telno);
        session.save(ogrenci);
        session.getTransaction().commit();
    }
    public void ogrenciListele(String ogrencino,String adsoyad,String sehir,String telno){
        String hql = "from Ogrenci";
        Query query = session.createQuery(hql);
        List<Ogrenci> listCategories = query.list();
        for (Ogrenci ogr : listCategories) {
        session.beginTransaction();
        List ogrencilerList = session.createQuery(hql).list();
        session.getTransaction().commit();
        ogrenciGoster(ogrencilerList);
}
    }
    public void ogrenciGuncelle(String ogrenciid, String ogrencino,String adsoyad,String sehir,String telno){
        Transaction transaction = session.beginTransaction();
        try{Ogrenci ogrenci = new Ogrenci();
        String hql = "update Ogrenci set  ogrencino= :ogrencino, adsoyad= :adsoyad, sehir= :sehir, telno= :telno where ogrenciid = :ogrenciid";
        Query query = session.createQuery(hql);
        query.setText("telno", telno);
        query.setText("sehir", sehir);
        query.setText("adsoyad",adsoyad);
        query.setText("ogrencino",ogrencino);
        query.setText("ogrenciid", ogrenciid);
        query.executeUpdate();
        transaction.commit();}
        catch(Exception e){
            transaction.rollback();
        }
    }
    public void ogrenciSil(String ogrenciid){
        Transaction transaction = session.beginTransaction();
        String hql = "delete from Ogrenci where ogrenciid = :ogrenciid";
        Query query = session.createQuery(hql);
        query.setText("ogrenciid", ogrenciid);
        query.executeUpdate();
        transaction.commit();
    }
    private void ogrenciGoster(List<Ogrenci> ogrencilerList) {
        model.getDataVector().removeAllElements();
        for (Ogrenci gelenOgrenci : ogrencilerList) {
            satir=new Vector();
            satir.add(gelenOgrenci.getOgrenciid());
            satir.add(gelenOgrenci.getOgrencino());
            satir.add(gelenOgrenci.getAdsoyad());
            satir.add(gelenOgrenci.getSehir());
            satir.add(gelenOgrenci.getTelno());
            model.addRow(satir);
        }
    }
}
