package com.crudTienda.crudTienda.services;

import com.crudTienda.crudTienda.domain.ListaComprasDTO;
import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.crudTienda.crudTienda.domain.UsuarioDTO;
import com.crudTienda.crudTienda.model.ListaCompras;
import com.crudTienda.crudTienda.model.Producto;
import com.crudTienda.crudTienda.model.Usuario;
import com.crudTienda.crudTienda.repository.IListaComprasRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListaComprasServiceImpl implements IListaComprasService{

    private final IListaComprasRepository iListaComprasRepository;

    private final ModelMapper modelMapper;

    public ListaComprasServiceImpl(IListaComprasRepository iListaComprasRepository, ModelMapper modelMapper) {
        this.iListaComprasRepository = iListaComprasRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public ListaComprasDTO findListaComprasById(Integer idListaCompras) {
        ListaCompras listaCompras = this.iListaComprasRepository.findListaComprasById(idListaCompras);
        ListaComprasDTO ListaComprasDTO1 = modelMapper.map(listaCompras, ListaComprasDTO.class);
        return ListaComprasDTO1;
    }

    @Override
    public List<ListaComprasDTO> findAllListaCompras() {
        List<ListaCompras> listaComprass = this.iListaComprasRepository.findAll();
        System.out.println("llega aqui?");
        List<ListaComprasDTO> listaComprasDTOS = listaComprass.stream().map(listaCompras ->  modelMapper.map(listaCompras, ListaComprasDTO.class)).collect(Collectors.toList());
        return listaComprasDTOS;
    }

    @Override
    public ListaComprasDTO updateListaCompras(Integer idLista, ListaComprasDTO listaComprasDTO) {
        return null;
    }

    @Override
    public ListaComprasDTO createListaCompras(ListaComprasDTO listaComprasDTO) {
        ListaCompras listaCompras = modelMapper.map(listaComprasDTO, ListaCompras.class);
        ListaComprasDTO listaComprasDTO1 = modelMapper.map(iListaComprasRepository.save(listaCompras), ListaComprasDTO.class);
        return listaComprasDTO1;
    }
}
