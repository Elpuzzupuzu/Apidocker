package com.MimitosShop.API.Service;


import com.MimitosShop.API.Model.Cart;
import com.MimitosShop.API.Model.CartItem;
import com.MimitosShop.API.Model.CartItemDTO;
import com.MimitosShop.API.Model.Product;
import com.MimitosShop.API.Repository.CartItemRepository;
import com.MimitosShop.API.Repository.CartRepository;
import com.MimitosShop.API.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemService {

    private final CartItemRepository cartItemRepository;
    private final CartRepository cartRepository;
    private final ProductRepository productRepository;

    @Autowired
    public CartItemService(CartItemRepository cartItemRepository, CartRepository cartRepository, ProductRepository productRepository) {
        this.cartItemRepository = cartItemRepository;
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    // Método para agregar un item al carrito
    public CartItemDTO addItemToCart(Long cartId, Long productId, Integer quantity) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new RuntimeException("Cart not found"));
        Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));

        // Crear el cartItem
        CartItem cartItem = new CartItem();
        cartItem.setCart(cart);
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);

        // Guardar el cartItem en el repositorio
        cartItem = cartItemRepository.save(cartItem);

        // Convertir el CartItem a CartItemDTO
        return new CartItemDTO(cartItem.getCart().getId(), cartItem.getProduct().getId(), cartItem.getQuantity());
    }
}
