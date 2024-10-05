

import java.util.ArrayList;
import javax.swing.*;

public class AppHome extends JFrame {


    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Product> cart = new ArrayList<>();

    public AppHome() {
        products.add(new Product("Addidas", 200, 100));
        products.add(new Product("Nike", 300, 100));
        products.add(new Product("Puma", 600, 100));

        initComponents();


        for (Product p: products){
            selectProduct.addItem("# "+p.title);
        }
        selectProduct.setSelectedIndex(0);
    }


    @SuppressWarnings("unchecked")

    String getProductList(){
        String prodList = "Product List: \n";
        int i = 1;
        for (Product p: products){
            prodList += i+"." +p+ "\n";
            i++;
        }
        return prodList;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProductListPanel = new javax.swing.JPanel();
        productListPane = new javax.swing.JScrollPane();
        productList = new javax.swing.JTextArea();
        cartOverviewArea = new javax.swing.JScrollPane();
        cartOverview = new javax.swing.JTextArea();
        ProductShoppingPanel = new javax.swing.JPanel();
        selectProduct = new javax.swing.JComboBox<>();
        selectItemLabel = new javax.swing.JLabel();
        promptQuantityLabel = new javax.swing.JLabel();
        add2CartButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        ProgramTitle = new javax.swing.JLabel();
        priceBrief = new javax.swing.JLabel();
        removeItemButton = new javax.swing.JButton();
        quantityField = new javax.swing.JSpinner();
        deleteItemButton = new javax.swing.JButton();
        NewItemAddPanel = new javax.swing.JPanel();
        newItemAddMenuLabel = new javax.swing.JLabel();
        newItemTitleField = new javax.swing.JTextField();
        newItemTitleLabel = new javax.swing.JLabel();
        newItemPriceLabel = new javax.swing.JLabel();
        newItemPriceField = new javax.swing.JTextField();
        newItemStockLabel = new javax.swing.JLabel();
        newItemStockField = new javax.swing.JTextField();
        newItemAddButton = new javax.swing.JButton();
        selectedItemDetailsPane = new javax.swing.JScrollPane();
        selectedProductDetails = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        productList.setEditable(false);
        productList.setColumns(20);
        productList.setRows(5);
        productList.setText(getProductList());
        productList.setBorder(null);
        productList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productList.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        productList.setFocusable(false);
        productList.setMargin(new java.awt.Insets(8, 8, 8, 8));
        productList.setName("productList"); // NOI18N
        productList.setRequestFocusEnabled(false);
        productListPane.setViewportView(productList);

        cartOverview.setEditable(false);
        cartOverview.setColumns(20);
        cartOverview.setRows(5);
        cartOverview.setText("Cart:");
        cartOverview.setFocusable(false);
        cartOverviewArea.setViewportView(cartOverview);

        javax.swing.GroupLayout ProductListPanelLayout = new javax.swing.GroupLayout(ProductListPanel);
        ProductListPanel.setLayout(ProductListPanelLayout);
        ProductListPanelLayout.setHorizontalGroup(
            ProductListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductListPanelLayout.createSequentialGroup()
                .addGroup(ProductListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartOverviewArea, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(productListPane))
                .addContainerGap())
        );
        ProductListPanelLayout.setVerticalGroup(
            ProductListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductListPanelLayout.createSequentialGroup()
                .addComponent(productListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartOverviewArea))
        );

        selectProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProductActionPerformed(evt);
            }
        });

        selectItemLabel.setText("Select an item:");
        selectItemLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        promptQuantityLabel.setText("Enter Quantity: ");
        promptQuantityLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        add2CartButton.setText("Add to Cart");
        add2CartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add2CartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2CartButtonActionPerformed(evt);
            }
        });

        checkoutButton.setText("Checkout");
        checkoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        ProgramTitle.setBackground(new java.awt.Color(255, 255, 255));
        ProgramTitle.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        ProgramTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProgramTitle.setText("Simple E-Commerce App");
        ProgramTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));

        priceBrief.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        priceBrief.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        removeItemButton.setText("Remove");
        removeItemButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });

        quantityField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quantityField.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityFieldStateChanged(evt);
            }
        });

        deleteItemButton.setText("Delete Item");
        deleteItemButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductShoppingPanelLayout = new javax.swing.GroupLayout(ProductShoppingPanel);
        ProductShoppingPanel.setLayout(ProductShoppingPanelLayout);
        ProductShoppingPanelLayout.setHorizontalGroup(
            ProductShoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductShoppingPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(ProductShoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductShoppingPanelLayout.createSequentialGroup()
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addComponent(ProgramTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductShoppingPanelLayout.createSequentialGroup()
                        .addGroup(ProductShoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkoutButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ProductShoppingPanelLayout.createSequentialGroup()
                                .addComponent(add2CartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(priceBrief, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductShoppingPanelLayout.createSequentialGroup()
                                .addGroup(ProductShoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(promptQuantityLabel)
                                    .addComponent(selectItemLabel))
                                .addGap(18, 18, 18)
                                .addGroup(ProductShoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(quantityField))))
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductShoppingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        ProductShoppingPanelLayout.setVerticalGroup(
            ProductShoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductShoppingPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ProgramTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(ProductShoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectItemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(ProductShoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(promptQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(priceBrief, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(ProductShoppingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add2CartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        newItemAddMenuLabel.setText("Add a New Item to the List:");

        newItemTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemTitleFieldActionPerformed(evt);
            }
        });

        newItemTitleLabel.setText("Product Name:");

        newItemPriceLabel.setText("Product Price:");

        newItemStockLabel.setText("Initial Stock:");

        newItemStockField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemStockFieldActionPerformed(evt);
            }
        });

        newItemAddButton.setText("Add");
        newItemAddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newItemAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewItemAddPanelLayout = new javax.swing.GroupLayout(NewItemAddPanel);
        NewItemAddPanel.setLayout(NewItemAddPanelLayout);
        NewItemAddPanelLayout.setHorizontalGroup(
            NewItemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewItemAddPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(NewItemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newItemAddMenuLabel)
                    .addGroup(NewItemAddPanelLayout.createSequentialGroup()
                        .addGroup(NewItemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newItemStockLabel)
                            .addComponent(newItemTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newItemPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(NewItemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newItemTitleField)
                            .addComponent(newItemPriceField)
                            .addComponent(newItemStockField)
                            .addComponent(newItemAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewItemAddPanelLayout.setVerticalGroup(
            NewItemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewItemAddPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(newItemAddMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewItemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newItemTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newItemTitleLabel))
                .addGap(18, 18, 18)
                .addGroup(NewItemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newItemPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newItemPriceLabel))
                .addGap(18, 18, 18)
                .addGroup(NewItemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newItemStockLabel)
                    .addComponent(newItemStockField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(newItemAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        selectedProductDetails.setEditable(false);
        selectedProductDetails.setColumns(20);
        selectedProductDetails.setRows(5);
        selectedProductDetails.setText("Selected Item Details will be shown Here");
        selectedProductDetails.setFocusable(false);
        selectedItemDetailsPane.setViewportView(selectedProductDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ProductListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProductShoppingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectedItemDetailsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(NewItemAddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectedItemDetailsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewItemAddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ProductShoppingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProductListPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newItemTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemTitleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newItemTitleFieldActionPerformed

    private void newItemAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemAddButtonActionPerformed
        // TODO add your handling code here:

        String title = newItemTitleField.getText();
        int stock;
        double price;
        try {
            price = Double.parseDouble(newItemPriceField.getText());
            stock = Integer.parseInt(newItemStockField.getText());
        } catch (NumberFormatException e){
            return;
        }
        if (title.length()<=0 || price<=0 || stock <=0){
            return;
        }

        for (Product p: products){
            if (title.equals(p.title)){
                p.availableQuantity += stock;
                p.price = price;
                productList.setText(getProductList());
                Product selected = products.get(selectProduct.getSelectedIndex());
                if (title.equals(selected.title)){
                    String details = "Selected Product: " + selected.title +"\nPrice: "+selected.price+" Taka\nIn stock: "+selected.availableQuantity+" pieces";
                    selectedProductDetails.setText(details);
                }
                return;
            }
        }

        Product newProduct = new Product(title, price, stock);
        this.products.add(newProduct);
        selectProduct.addItem("# "+newProduct.title);
        productList.setText(getProductList());
        newItemTitleField.setText("");
        newItemPriceField.setText("");
        newItemStockField.setText("");
    }//GEN-LAST:event_newItemAddButtonActionPerformed

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        // TODO add your handling code here:
        int indx  = selectProduct.getSelectedIndex();

        if (indx<0){
            priceBrief.setText("Select a product or add new!");
            return;
        }
        Product selected = products.get(indx);
        int quantity;
        quantity = (int)quantityField.getValue();

        if (quantity<=0){
            return;
        }
        Product foundProductInCart = null;
        for (Product p: cart){
            if (p.title.equals(selected.title)){
                foundProductInCart = p;
            }
        }

        if (foundProductInCart==null){
            return;
        }
        else {
            if (foundProductInCart.availableQuantity >= quantity){
                foundProductInCart.availableQuantity -= quantity;
            }
        }
        int i = 1;
        String info = "";
        for (Product p: cart){
            if (p.availableQuantity>0){
                info += i+". "+p.title+" | Quantity: "+p.availableQuantity+" | Cost: "+(p.availableQuantity*p.price+" Taka\n");
            }
            i++;
        }
        double total = getTotalCost();
        cartOverview.setText("Cart:\n"+info+(total>0?"Total Cost: "+total+" Taka":""));
    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void add2CartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2CartButtonActionPerformed
        // TODO add your handling code here:

        int indx  = selectProduct.getSelectedIndex();

        if (indx<0){
            priceBrief.setText("Select a product or add new!");
            return;
        }
        Product selected = products.get(indx);
        int quantity = (int)quantityField.getValue();

        if (quantity<=0){
            priceBrief.setText("At least 1 unit required to add to the cart!");
            return;
        }

        Product foundProductInCart=null;
        for (Product p: cart){
            if (p.title.equals(selected.title)){
                foundProductInCart = p;
            }
        }


        if (foundProductInCart==null){
            cart.add(new Product(selected.title, selected.price, quantity));
        }
        else {
            if (foundProductInCart.availableQuantity+quantity > selected.availableQuantity){
                priceBrief.setText("Not available in stock!");
                return;
            }
            else {
                foundProductInCart.availableQuantity += quantity;
            }

        }

        int i = 1;
        String info = "";
        for (Product p: cart){
            info += i+". "+p.title+" | Quantity: "+p.availableQuantity+" | Cost: "+(p.availableQuantity*p.price+" Taka\n");
            i++;
        }
        cartOverview.setText("Cart:\n"+info+"Total: "+getTotalCost()+" Taka");
    }//GEN-LAST:event_add2CartButtonActionPerformed

    private void selectProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProductActionPerformed
        // TODO add your handling code here:
        int indx = selectProduct.getSelectedIndex();

        if (indx==-1){
            selectedProductDetails.setText("Please add a product and select it to see details!");
            return;
        }
        Product selected;
        try {
            selected = products.get(indx);
        } catch (IndexOutOfBoundsException e){
            return;
        }
        String details = "Selected Product: " + selected.title +"\nPrice: "+selected.price+" Taka\nIn stock: "+selected.availableQuantity+" pieces";
        selectedProductDetails.setText(details);
    }//GEN-LAST:event_selectProductActionPerformed

    private void deleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemButtonActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String)selectProduct.getSelectedItem();

        if (selectedItem == null){
            return;
        }

        Product foundProductInCart=null, foundProductInStock = null;
        for (Product p: cart){
            if (selectedItem.equals("# "+p.title)){
                foundProductInCart = p;
            }
        }
        for (Product p: products){
            if (selectedItem.equals("# "+p.title)){
                foundProductInStock=p;
            }
        }

        if (foundProductInCart!=null){
            cart.remove(foundProductInCart);
        }

        if (foundProductInStock!=null){
            products.remove(foundProductInStock);
            priceBrief.setText("Product has been deleted!");
        }

        if (foundProductInStock==null && foundProductInCart!=null){
            priceBrief.setText("Product not found!");
            return;
        }
        selectProduct.removeItem(selectProduct.getSelectedItem());
        if (!products.isEmpty()){
            selectProduct.setSelectedIndex(0);
        }
        else {
            selectProduct.setSelectedItem(null);
            return;
        }
        int i = 1;
        String info = "";
        for (Product p: cart){
            if (p.availableQuantity>0)
                info += i+". "+p.title+" | Quantity: "+p.availableQuantity+" | Cost: "+(p.availableQuantity*p.price+" Taka\n");
            i++;
        }
        double total = getTotalCost();
        cartOverview.setText("Cart:\n"+info+(total>0?"Total Cost: "+total+" Taka":""));
        productList.setText(getProductList());
    }//GEN-LAST:event_deleteItemButtonActionPerformed

    private void quantityFieldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityFieldStateChanged
        // TODO add your handling code here:

        int indx = selectProduct.getSelectedIndex();

        if (indx<0){
            priceBrief.setText("");
            return;
        }
        Product selected = products.get(indx);
        int quantity = (int)quantityField.getValue();

        if (quantity <= 0){
            quantityField.setValue(0);
            priceBrief.setText("Select at least 1!");
        }
        else if (quantity>selected.availableQuantity){
            quantityField.setValue(selected.availableQuantity);
            priceBrief.setText("Not enough in stock!");
        }
        else {
            priceBrief.setText("Price: "+(selected.price*quantity)+" Taka");
        }
    }//GEN-LAST:event_quantityFieldStateChanged

    private void newItemStockFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemStockFieldActionPerformed
        // TODO add your handling code here:
        newItemAddButtonActionPerformed(evt);
    }//GEN-LAST:event_newItemStockFieldActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        // TODO add your handling code here:
        String message = "";
        int totalProductCount=0;

        for (Product p: cart){
            totalProductCount+=p.availableQuantity;
            message += "# "+p.title+" | "+p.availableQuantity+" units \n";
        }
        int confirm=-1;
        if (totalProductCount>0){
            message = message.concat("Total Products: "+totalProductCount).concat("\nTotal Cost: "+getTotalCost());
            confirm = JOptionPane.showConfirmDialog(this, message.concat("\n\nConfirm Purchase?"), "Confirm Purchase", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showConfirmDialog(this, "No Products in the cart", "Empty Cart", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }

        if  (confirm==0){
            for (Product p: cart){
                for (Product P: products){
                    if (P.title.equals(p.title)){
                        P.availableQuantity -= p.availableQuantity;
                        break;
                    }
                }
            }
            cart.clear();
            productList.setText(getProductList());
            cartOverview.setText("Cart: \n");
            selectProduct.setSelectedItem(null);
            quantityField.setValue(0);
            selectedProductDetails.setText("Select an item from the choice list.");
            priceBrief.setText("Purchase successful!");
        }
    }//GEN-LAST:event_checkoutButtonActionPerformed

    double getTotalCost(){
        double totalCost = 0;

        for (Product p: cart){
            totalCost += p.price*p.availableQuantity;
        }

        return totalCost;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    // break;
                }
                System.out.println(info.getName());

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppHome().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NewItemAddPanel;
    private javax.swing.JPanel ProductListPanel;
    private javax.swing.JPanel ProductShoppingPanel;
    private javax.swing.JLabel ProgramTitle;
    private javax.swing.JButton add2CartButton;
    private javax.swing.JTextArea cartOverview;
    private javax.swing.JScrollPane cartOverviewArea;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JButton newItemAddButton;
    private javax.swing.JLabel newItemAddMenuLabel;
    private javax.swing.JTextField newItemPriceField;
    private javax.swing.JLabel newItemPriceLabel;
    private javax.swing.JTextField newItemStockField;
    private javax.swing.JLabel newItemStockLabel;
    private javax.swing.JTextField newItemTitleField;
    private javax.swing.JLabel newItemTitleLabel;
    private javax.swing.JLabel priceBrief;
    private javax.swing.JTextArea productList;
    private javax.swing.JScrollPane productListPane;
    private javax.swing.JLabel promptQuantityLabel;
    private javax.swing.JSpinner quantityField;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JLabel selectItemLabel;
    private javax.swing.JComboBox<String> selectProduct;
    private javax.swing.JScrollPane selectedItemDetailsPane;
    private javax.swing.JTextArea selectedProductDetails;
    // End of variables declaration//GEN-END:variables
}
