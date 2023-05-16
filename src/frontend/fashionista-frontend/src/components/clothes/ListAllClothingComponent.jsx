import * as React from 'react';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import { Paper } from '@mui/material';
import { clothingDataset } from '../../sampledata/clothingdataset';
import { styled } from '@mui/material/styles';
import { tableCellClasses } from '@mui/material/TableCell';

function ListAllClothing(){

    const StyledTableCell = styled(TableCell)(({ theme }) => ({
        [`&.${tableCellClasses.head}`]: {
          backgroundColor: theme.palette.common.black,
          color: theme.palette.common.white,
        },
        [`&.${tableCellClasses.body}`]: {
          fontSize: 14,
        },
      }));
      
      const StyledTableRow = styled(TableRow)(({ theme }) => ({
        '&:nth-of-type(odd)': {
          backgroundColor: theme.palette.action.hover,
        },
        // hide last border
        '&:last-child td, &:last-child th': {
          border: 0,
        },
      }));
    
    return(
        <div>
            <TableContainer component={Paper}>
                <Table>
                    <TableHead>
                        <TableRow>
                            <StyledTableCell >name</StyledTableCell>
                            <StyledTableCell>color</StyledTableCell>
                            <StyledTableCell >material</StyledTableCell>
                            <StyledTableCell>size</StyledTableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {clothingDataset?.map((clothes =>(
                            <StyledTableRow key={clothes.clothId}>
                                <StyledTableCell >{clothes.name}</StyledTableCell>
                                <StyledTableCell align='center'>{clothes.color}</StyledTableCell>
                                <StyledTableCell align='center'>{clothes.material}</StyledTableCell>
                                <StyledTableCell align='center'>{clothes.size}</StyledTableCell>
                            </StyledTableRow>
                        )))}
                    </TableBody>
                </Table>
            </TableContainer>

        </div>
    )


}

export default  ListAllClothing