import * as React from 'react';
import { useState, useEffect } from 'react'
import Button from '@mui/material/Button';
import Dialog from '@mui/material/Dialog';
import { DialogContent, Table, TableBody, TableCell, TableContainer, TableHead, TableRow } from '@mui/material';
import { Link } from 'react-router-dom';
import{useNavigate} from 'react-router-dom'
import ClothServices from '../../services/ClothServices';

function UpdateDeleteClothesList(){

    const [clothesList,setClothesList]= useState(['']);
    const [open,setOpen]= React.useState(false);
    // const navigate=useNavigate();

    const handleClose= () =>{
        setOpen(false)

    }
    const handleClickOpen =() =>{
        setOpen(true)
    } 

    useEffect(
        () =>{
            displayAllGoals();
        },[])


    const displayAllGoals = () =>{
        ClothServices.getAllClothes().then((response) =>{
            setClothesList(response.data)
            // console.log(response.data)
        })
    };


    const deleteClothes=(clothId) =>{
        ClothServices.deleteClothes(clothId).then(
            (response)=>{
                displayAllGoals();
                window.location.reload(true);
                handleClose();
            }
        ).catch(error =>{
            console.log(error);
        })
    }


    return(
        <div>
        <Button variant='contained' onClick={handleClickOpen}>Update Clothing</Button>
        <Dialog open={open} onClose={handleClose}>
        <DialogContent>
            <TableContainer>
                <Table>
                    <TableHead>
                <TableRow>
                    <TableCell align='right'>Clothes</TableCell>
                    <TableCell align='right'>Actions</TableCell>
                </TableRow>
                </TableHead>
                <TableBody>
                    {clothesList.map(
                        cloth =>
                        <TableRow key={cloth.goalId}>
                            <TableCell>{cloth.title}</TableCell>
                            <TableCell>
                            <Button variant={"Contained"} component={Link} to= {`/updateGoal/${cloth.clothId}`}>Update</Button>
                                <Button 
                                variant={'Contained'} 
                                color={"secondary"} 
                                onClick={() => handleClose()} 
                                style={{marginLeft:"10px"}}>Delete</Button>
                            </TableCell>
                        </TableRow>
                    )}
                </TableBody>
                </Table>
            </TableContainer>
        </DialogContent>
        </Dialog>
    </div>
    )
}

export default UpdateDeleteClothesList;