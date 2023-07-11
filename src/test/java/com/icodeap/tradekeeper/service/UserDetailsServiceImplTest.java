package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.User;
import com.icodeap.tradekeeper.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserDetailsServiceImplTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testLoadUserByUsername() {
        // Mock data
        String username = "john_doe";
        User user = new User();
        user.setUsername(username);
        when(userRepository.findByUsername(username)).thenReturn(Optional.of(user));

        // Test
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);

        // Verify
        assertNotNull(userDetails);
        assertEquals(username, userDetails.getUsername());
        verify(userRepository, times(1)).findByUsername(username);
    }

    @Test
    void testLoadUserByUsername_UserNotFound() {
        // Mock data
        String username = "john_doe";
        when(userRepository.findByUsername(username)).thenReturn(Optional.empty());

        // Test
        assertThrows(UsernameNotFoundException.class, () -> userDetailsService.loadUserByUsername(username));

        // Verify
        verify(userRepository, times(1)).findByUsername(username);
    }