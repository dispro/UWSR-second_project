package ru.leverx.egorov.dao;

import ru.leverx.egorov.models.Link;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class LinksDAO implements DAO<Link> {

    private Jdbc db;

    @Override
    public Optional<Link> find(Long id) throws SQLException {
        ResultSet linkFromDb = Jdbc.statement.executeQuery("SELECT * FROM links WHERE Id = " + id);
        Optional<Link> link = Optional.ofNullable((Link) linkFromDb);
        return link;
    }

    @Override
    public void save(Link model) throws SQLException {
        Jdbc.statement.execute("INSERT INTO links(Ref,Title,DescriptionLink) Value("+model.getRef()+","+model.getTitle()+","+model.getDescriptionLink()+")");
    }

    @Override
    public void update(Link model) {

    }

    @Override
    public void delete(Long id) throws SQLException {
        Jdbc.statement.execute("DELETE FROM links WHERE Id = " + id);
    }

    @Override
    public List<Link> findAll() throws SQLException {
        List<Link> list = new ArrayList<Link>();
        ResultSet linksFromDb = Jdbc.statement.executeQuery("SELECT * FROM links");
        while(linksFromDb.next()){
            Link link = (Link)linksFromDb;
            list.add(link);
        }
        return list;
    }
}
